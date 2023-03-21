package org.training.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;

public class TwoCustomCountJobPerformable extends AbstractJobPerformable<CronJobModel> {
    private static final Logger LOG = Logger.getLogger(TwoCustomCountJobPerformable.class);
    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        LOG.info(
                "###################################################################################################################### Counting Till 300 starts");

        for (int i = 0; i < 10; i++)
        {

            LOG.info("Now Printing the Counting for Class : TwoCustomCountJobPerformable with current count :" + i);
        }



        LOG.info(
                "============================================== Count Finished for TwoCustomCountJobPerformable ================================================================================================================");

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

}
